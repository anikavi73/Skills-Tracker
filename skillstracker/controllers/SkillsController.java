package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SkillsController {

    @GetMapping
    @ResponseBody

    public String possibleProgramLanguage(){
        return "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody

    public String languageForm(){
        return "<form method = 'post' action= '/form'>" +

                "<label> Name: </label> " +
                "<input type = 'text' name ='name'> <br />" +

                "<label> My favorite language: </label> " +
                "<select name='language1'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option> " +
                    "<option value= 'python'>Python</option>" +
                "</select> <br />" +

                "<label> My second favorite language: </label> " +
                "<select name='language2'>" +
                    "<option value='java'>Java</option>" +
                    " <option value='javascript'>JavaScript</option> " +
                    "<option value= 'python'>Python</option>" +
                "</select> <br />" +

                "<label> My third favorite language: </label> " +
                "<select name='language3'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javascript'>JavaScript</option> " +
                    "<option value= 'python'>Python</option>" +
                "</select> <br />" +

                "<input type = 'submit' value = 'Submit'>" +
                "</form>";
    }

    @PostMapping("/form")
    @ResponseBody

    public String processForm(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }

}
