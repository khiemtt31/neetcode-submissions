func twoSum(nums []int, target int) []int {
    for i, numi := range nums {
        for j, numj := range nums {
            if i != j && numi+numj == target {
                return []int{i, j}
            }
        }
    }

    return nil
}