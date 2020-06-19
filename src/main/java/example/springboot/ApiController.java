package example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ApiController {
	@GetMapping(value = "/plus")
	@ApiOperation("加法计算。")
	public Object plus(@RequestParam long a, @RequestParam long b) throws Exception {
		return a + b;
	}
}
