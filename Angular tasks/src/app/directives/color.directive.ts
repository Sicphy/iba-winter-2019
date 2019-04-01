import {Directive, ElementRef, HostListener, Input, OnInit} from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {
  @Input() color = 'red';

  constructor(private elementRef: ElementRef) {
  }

  @HostListener('dblclick') onDBLClick() {
    console.log(this.elementRef.nativeElement.style.color);
    if (this.elementRef.nativeElement.style.color !== '') {
      this.elementRef.nativeElement.style.color = '';
    } else {
      this.elementRef.nativeElement.style.color = this.color;
    }
  }
}
