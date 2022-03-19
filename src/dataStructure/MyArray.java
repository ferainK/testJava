package dataStructure;

public class MyArray {
  private int[] arr;
  private int size = 0;
  private int maxSize;
  public static final int ERROR_NUM = -999999999;

  //생성자
  public MyArray() {
    maxSize = 10;
    arr = new int[maxSize];
  }

  public MyArray(int size){
    this.maxSize = size;
    arr = new int[size];
  }

  //메서드
  public void addElement(int num){
    //검토로직
    if(!checkSize()) {return;}
    //실행로직
    arr[size++] = num;  //size 사용 후 증가 (++size : 사용 전 증가)
  }

  public void insertElement(int index, int num){
    // 검토로직
    if(!checkSize()) {return;}
    if(!checkIndex(index)) {return;}
    //실행로직
    for(int i = size; i >= index - 1; i--){
      arr[i + 1] = arr[i];
    }
    arr[index - 1] = num;
    size++;
  }

  public void removeElement(int index){

  }

  public int getSize(){
    return size;
  }

  public boolean isEmpty(){
    if(size == 0) {
      return true;
    }
    return false;
  }

  public int getElement(int index) {
    if (!checkIndex(index)) {return ERROR_NUM;}
    return arr[index];
  }

  public void printAll()  {
    if(!checkSize()) {return;}
    for(int i = 0; size > i; i++){
      System.out.println(arr[i]);
    }
  }

  public void removeAll()  {
    for(int i = 0; size > i ; i++){
      arr[i] = 0;
    }
    size = 0;
  }




  //내부 함수
  private boolean checkSize() {
    if (size >= maxSize){
      System.out.println("not enough memory");
      return false;
    }
    return true;
  }

  private boolean checkIndex(int index) {
    if(index > size || index < 0) {
      System.out.println("not exist index");
      return false;
    }
    return true;
  }
}


// 실행 클래스
class Client {
  public static void main(String[] args) {
    MyArray arr = new MyArray();
    arr.addElement(1);
    arr.addElement(2);
    arr.addElement(3);
    arr.addElement(4);
    arr.addElement(5);
    arr.addElement(6);

    System.out.println("배열 사이즈 : " + arr.getSize());
    arr.printAll();

    arr.insertElement(4,40);
    arr.printAll();

    arr.removeAll();
    arr.printAll();
  }
}