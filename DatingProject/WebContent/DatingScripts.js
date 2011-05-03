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
	string3 = "DatingApp.saveButton(this.id)";
	button.innerHTML = "save changes";
	button.onclick = string3;
	textarea.readOnly= false;
};

DatingApp.saveButton = function(param){
	var buttonname, textareaname, string3;
	textareaname = param+"text";
	buttonname = param;
	string3 = "DatingApp.editButton(this.id)";
	var button = document.getElementById(buttonname);
	var textarea = document.getElementById(textareaname);
	button.innerHTML = "edit";
	button.onclick = string3;
	textarea.readOnly = true;
};