func isAnagram(s string, t string) bool {
    freq := make(map[rune]int)
    for _, c := range s {
        freq[c]++
    }
    for _, c := range t {
        freq[c]--
    }
    for _, c := range freq {
        if c != 0 {
            return false
        }
    }
    return true
}
