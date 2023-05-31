import { Component } from '@angular/core'; 

@Component({
  selector: 'app-code-mind',
  templateUrl: './code-mind.component.html',
  styleUrls: ['./code-mind.component.css']
})
export class CodeMindComponent {
mailUs()
{
  alert("Thanks for choosing us !\n\nDeveloper's Mail: official.amitrakte@gmail.com")
}
phoneUs()
{
  alert("Thanks for choosing us !\n\nDeveloper's Mobile: +91 7770081004")
}
webUs()
{
  window.location.href="https://github.com/Ameet-Rakte/Complaint-Redressal-System";
}
}
