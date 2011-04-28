/**
 * these are some JavaScripts I'm using
 */

var DatingApp = {};

DatingApp.editButton =function(param){
	var buttonname, textareaname, string3;
	textareaname = "textarea" + param;
	button name = "button"+param;
	var button = document.getElementByID(elementname);
	var textarea = document.getElementByID(textareaname);
	string3 = "DatingApp.saveButton("+param+")";
	button.innerHTML = "save changes";
	button.onclick = string3;
	textarea.removeAttribute("disabled");
}

DatingApp.saveButton = function(param){
	var buttonname, textareaname, string3;
	textareaname = "textarea" + param;
	button name = "button"+param;
	string3 = "DatingApp.editButton("+param+")";
	button.innerHTML = "edit";
	button.onclick = string3;
	textarea.setAttribute("disabled");
}