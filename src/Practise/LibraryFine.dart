void main() {
  int result = libraryFine(9, 6, 2015, 6, 6, 2015);
  print(result);
}

int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
  int fine = 0;
  if (y2 > y1 || (y1 == y2 && m2 > m1) || (y1 == y2 && m1 == m2 && d2 > d1)) {
    fine = 0;
  } else {
    if (y1 > y2) {
      fine = 10000;
    } else if (y1 <= y2 && m1 > m2) {
      fine = 500 * (m1 - m2);
    } else if (y1 <= y2 && m1 <= m2 && d1 > d2) {
      fine = 15 * (d1 - d2);
    }
  }
  return fine;
}
