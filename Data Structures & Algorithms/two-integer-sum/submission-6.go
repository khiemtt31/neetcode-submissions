func twoSum(nums []int, target int) []int {
	var res []int

    for i, numi := range nums {
		for j, numj := range nums {
			if i != j && numi + numj == target {
				res = append(res, i, j)
				return res;
			}	
		}
	}

	return res
}
