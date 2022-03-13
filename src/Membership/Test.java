package Membership;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args){
    ArrayList<Silver> member = new ArrayList<>();
    member.add(new VIP("이철우"));
    member.add(new Gold("똥우지"));
    member.add(new Silver("우지챠"));

    if (member.get(0) instanceof VIP) {
      member.add((VIP)member.get(0));
      member.remove(0);
      System.out.println("행변환 완료");
    }

    member.get(0).showInfo();
    member.get(1).showInfo();
    member.get(2).showInfo();

    System.out.println(member.get(0).priceUsedBonus(50000));
    System.out.println(member.get(1).priceUsedBonus(50000));
    System.out.println(member.get(2).priceUsedBonus(50000));
  }

}
