public static <T>
boolean isArraySorted(T[] elements, Comparator<? super T> cmp) {
  int n = elements.length;
  for (int i = 1; i < n; ++i) {
    if (cmp.compare(elements[i-1], elements[i]) > 0) { return false; }
  }
  return true;
}