package com.dmsdbj.team.springbootdemo.controller.springMVC.async;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.Callable;

/**
 * @Classname CallableController
 * @Auther sunshinezhang
 * @Date 2019/11/2 16:02
 */
@Controller
@RequestMapping("/async/callable")
public class CallableController {

	@GetMapping("/response-boby")
	public @ResponseBody Callable<String> callable(){
		return new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(2000);
				return "Callable result";
			}

		};
	}

	@GetMapping("/view")
	public Callable<String> callableWithView(final Model model) {
		return () -> {
			Thread.sleep(2000);
			model.addAttribute("foo", "bar");
			model.addAttribute("fruit", "apple");
			return "views/html";
		};
	}

	@GetMapping("/exception")
	public @ResponseBody Callable<String> callableWithException(final @RequestParam(required = false, defaultValue = "true") boolean handled) {
		return () -> {
			Thread.sleep(2000);
			if (handled) {
				throw new IllegalStateException("Callable error");
			} else {
				throw new IllegalArgumentException("Callable error");
			}
		};
	}

	@GetMapping("/custom-timeout-handling")
	public @ResponseBody WebAsyncTask<String> callableWithCustomTimeoutHandling(){
		Callable<String> callable = () -> {
			Thread.sleep(2000);
			return "Callable result";
		};
		return new WebAsyncTask<String>(1000,callable) ;
	}


	@ExceptionHandler
	@ResponseBody
	public String handleException(IllegalStateException ex){
		return "Handled exception:" + ex.getMessage();
	}
}
