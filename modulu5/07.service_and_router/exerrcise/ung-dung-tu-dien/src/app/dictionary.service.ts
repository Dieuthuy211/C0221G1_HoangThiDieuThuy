import { Injectable } from '@angular/core';

export interface IWord {
  key: string;
  meaning: string;
}

@Injectable()
export class DictionaryService {
  private words: IWord[] = [
    {
      key: 'Hello',
      meaning: 'Chào Bạn'
    }, {
      key: 'what do you do???',
      meaning: 'Bạn đang lm gì???'
    }, {
      key: 'goodnight',
      meaning: 'chúc ngủ ngon'
    }, {
      key: 'how are you???',
      meaning: 'bạn có khỏe không???'
    }, {
      key: 'how old are you???',
      meaning: 'bạn bao nhiêu tuổi???'
    }
  ];
  constructor() { }

  search(word: string): string {
    if (!word) {
      return '';
    }
    const w = this.words.find(item => item.key === word);
    if (w) {
      return w.meaning;
    }
    return 'Not found';
  }

  getAll(): IWord[] {
    return this.words;
  }
}
