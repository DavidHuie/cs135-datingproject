/**
 * these are some JavaScripts I'm using
 */

var DatingApp = {};

DatingApp.editButton =function(param){
	var buttonname, textareaname, string3;
	textareaname = param+"text";
	buttonname = param;
	var button = document.getElementById(buttonname);
	var textarea = document.getElementById(textareaname);
	button.innerHTML = "save changes";
	textarea.readOnly= false;
	button.onclick = DatingApp.saveButton(this.id);
};

DatingApp.saveButton = function(param){
	var buttonname, textareaname, string3;
	textareaname = param+"text";
	buttonname = param;
	string3 = "DatingApp.editButton(this.id)";
	var button = document.getElementById(buttonname);
	var textarea = document.getElementById(textareaname);
	button.innerHTML = "edit";
	textarea.readOnly = true;
	button.onclick = DatingApp.editButton(this.id);
};