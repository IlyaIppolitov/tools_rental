package com.itexclusive.toolsrental.controllers;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class CustomErrorController implements ErrorController {
    @GetMapping
    public String handle(HttpServletRequest request, Model model) {

        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int errorCode = Integer.parseInt(status.toString());

            switch (errorCode) {
                case 400 -> {
                    return completeResponse(model, HttpStatus.BAD_REQUEST);
                }
                case 403 -> {
                    return completeResponse(model, HttpStatus.FORBIDDEN);
                }
                case 404 -> {
                    return completeResponse(model, HttpStatus.NOT_FOUND);
                }
                case 405 -> {
                    return completeResponse(model, HttpStatus.METHOD_NOT_ALLOWED);
                }
                case 500 -> {
                    return completeResponse(model, HttpStatus.INTERNAL_SERVER_ERROR);
                }
                default -> {
                    return "redirect:/";
                }
            }
        }

        return "redirect:/";
    }

    private String completeResponse(Model model, HttpStatus status) {
        model.addAttribute("statusCode", status.value());
        model.addAttribute("message", status.getReasonPhrase());
        return "errors/error_" + status.value();

    }
}

