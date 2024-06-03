package algorithms.api.resource;

import algorithms.api.dto.ListNode;
import algorithms.api.service.leetcode.LeetCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leetcode")
public class LeetCodeResource {

	@Autowired
	LeetCodeService service;

	@GetMapping("/add-two-numbers")
	public ListNode getSmallestIntegerNotFound(ListNode l1, ListNode l2) {
		return service.getSum(l1, l2);
	}
}
