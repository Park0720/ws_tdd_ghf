package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        long lastWiseSayingId = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.isEmpty()) continue;

            switch (cmd) {
                case "종료":
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                case "등록":
                    System.out.print("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.print("작가 : ");
                    String authorName = sc.nextLine().trim();



                    long id = ++lastWiseSayingId;

                    wiseSayings.add(new WiseSaying(id, content, authorName));

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    break;
                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");

                    for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                        WiseSaying wiseSaying = wiseSayings.get(i);

                        System.out.printf("%d / %s / %s\n", wiseSaying.id, wiseSaying.authorName, wiseSaying.content);
                    }
                    break;
                default:
                    System.out.printf("`%s`(은)는 올바르지 않은 명령입니다.\n", cmd);
                    break;
            }
        }
    }
}