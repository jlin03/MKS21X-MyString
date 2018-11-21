public class MyString implements CharSequence,Comparable<CharSequence> {
  private char[] data;
  public int l;
  public MyString(CharSequence s) {
    l = s.length();
    data = new char[s.length()];
    for(int i = 0;i < s.length();i++) {
      data[i] = s.charAt(i);
    }
  }

  public static char charAt(int index) {
    return data[index];
  }

  public static int length() {
    int count = 0;
    for(int i = 0;i < this.length();i++) {
      count += 1;
    }
    return count;
  }

  public static CharSequence subSequence(int start, int end) {
    char[] newdata = new char[end-start];
    for(int i = start;i < end;i++) {
      newdata[i-start] = this.charAt(i);
    }
    return newdata;
  }

  public static String toString() {
    String out = "";
    for(int i = 0;i < this.length();i++) {
      out += charAt(i);
    }
    return out;
  }

  public static int compareTo(MyString o) {
    int out = 0;
    if(o.length() == this.length()) {
      for(int i = 0;i < this.length();i++) {
        if(out == 0) {
          out = this.charAt(i) - o.charAt(i);
        }
      }
    }
    if(o.length() > this.length()) {
      out = -1;
    }
    else {
      out = 1;
    }
    return out;
  }



}
