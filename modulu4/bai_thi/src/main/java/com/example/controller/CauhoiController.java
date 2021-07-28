package com.example.controller;

import com.example.dto.CauhoiDto;
import com.example.model.entity.CauHoi;
import com.example.model.entity.LoaiCauHoi;
import com.example.model.service.ICauHoiService;
import com.example.model.service.ILoaiCauHoiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/cauHois")
public class CauhoiController {
    @Autowired
    ICauHoiService cauHoiService;
    @Autowired
    ILoaiCauHoiService loaiCauHoiService;

    @GetMapping(value = "")
    private String showHome() {
        return "home";
    }
    @GetMapping(value = "/list")
    public String showList(@RequestParam("tieuDe") Optional<String> tieuDe,
                               @RequestParam("loaiCauHoi") Optional<String> loaiCauhoi,
                               @PageableDefault(value = 5) Pageable pageable, Model model) {
        List<LoaiCauHoi> loaiCauHois=loaiCauHoiService.findAll();
        Page<CauHoi> cauHois = cauHoiService.findByTieuDeContaining(tieuDe.orElse(""),loaiCauhoi.orElse(""), pageable);
        model.addAttribute("cauHois", cauHois);
        model.addAttribute("tieuDe", tieuDe.orElse(""));
        model.addAttribute("loaiCauHoi", loaiCauhoi.orElse(""));
        model.addAttribute("loaiCauHois", loaiCauHois);
        return "list";
    }
    @GetMapping(value = "/create")
    public String showCreate(Model model){
        List<LoaiCauHoi> loaiCauHois=loaiCauHoiService.findAll();
        model.addAttribute("loaiCauHois",loaiCauHois);
        model.addAttribute("cauHoiDto",new CauhoiDto());
        return "/create";
    }
    @PostMapping(value = "/create")
    public String createCustomer(@Valid @ModelAttribute("cauHoiDto") CauhoiDto cauHoiDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        CauHoi cauHoi=new CauHoi();
        BeanUtils.copyProperties(cauHoiDto,cauHoi);
        if(bindingResult.hasErrors()){
            List<LoaiCauHoi> loaiCauHois=loaiCauHoiService.findAll();
            model.addAttribute("loaiCauHois", loaiCauHois);
            return "/create";
        }else {
            cauHoiService.save(cauHoi);
            List<LoaiCauHoi> loaiCauHois=loaiCauHoiService.findAll();
            model.addAttribute("loaiCauHois", loaiCauHois);
            redirectAttributes.addFlashAttribute("msg", "tạo thành công");
            return "redirect:/cauHois/list";
        }
    }
    @PostMapping(value = "/delete")
    public String delete(@RequestParam Integer id,RedirectAttributes redirectAttributes){
        CauHoi cauHoi=cauHoiService.findById(id);
        if(cauHoi==null){
            return "error.404";

        }else {
            cauHoi.setFlag(true);
            cauHoiService.save(cauHoi);
            redirectAttributes.addFlashAttribute("msg","xóa thành công");
            return "redirect:/cauHois/list";
        }

    }

}
