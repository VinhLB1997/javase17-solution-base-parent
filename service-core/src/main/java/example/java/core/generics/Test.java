package example.java.core.generics;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		if (list instanceof List<String>) {
			log.info("Running");
		}
	}
}
