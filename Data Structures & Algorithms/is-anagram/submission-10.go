func isAnagram(s string, t string) bool {
    freq := make(map[rune]int)
    for _, chara := range s {
        freq[chara]++
    }
    for _, chara := range t {
        freq[chara]--
    }
    for _, count := range freq {
        if count != 0 {
            return false
        }
    }
    return true
}   
