package com.example.controller;

import com.example.model.entity.contract.Contract;
import com.example.model.entity.contract_detail.AttachService;
import com.example.model.entity.contract_detail.ContractDetail;
import com.example.model.service.IAttachService;
import com.example.model.service.IContractDetailService;
import com.example.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/contractDetails")
public class ContractDetailController {
    @Autowired
    IContractService contractService;
    @Autowired
    IContractDetailService contractDetailService;
    @Autowired
    IAttachService iAttachService;
    @GetMapping(value = "")
    public String showCreate(Model model){
        List<Contract> contracts=contractService.findAll();
        List<AttachService> attachServices=iAttachService.findAll();
        model.addAttribute("contracts",contracts);
        model.addAttribute("attachServices",attachServices);
        model.addAttribute("contractDetail",new ContractDetail());
        return "contract_detail/create";
    }
    @PostMapping(value = "/create")
    public String createContractDetail(@ModelAttribute("contractDetail") ContractDetail contractDetail,Model model){
        List<Contract> contracts=contractService.findAll();
        List<AttachService> attachServices=iAttachService.findAll();
        if(contractDetail!=null){
            contractDetailService.save(contractDetail);
            model.addAttribute("contracts",contracts);
            model.addAttribute("attachServices",attachServices);
            return "contract_detail/create";
        }else {
            return "error.404";
        }
    }
}
