import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        printHeader();

        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = readInteger(scanner, "Pilih menu: ");

            switch (choice) {
                case 1:
                    handleInsert(tree, scanner);
                    break;
                case 2:
                    handleSearch(tree, scanner);
                    break;
                case 3:
                    handleTraversalMenu(tree, scanner);
                    break;
                case 4:
                    handleSummary(tree);
                    break;
                case 5:
                    handleReset(tree, scanner);
                    break;
                case 0:
                    running = false;
                    System.out.println("\nTerima kasih telah menggunakan StructLab Explorer.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka pada menu.");
            }

            if (running) {
                printSeparator();
            }
        }

        scanner.close();
    }

    private static void printHeader() {
        System.out.println("============================================");
        System.out.println(" StructLab Explorer - Data Structure Simulator");
        System.out.println(" Binary Search Tree CLI");
        System.out.println("============================================");
    }

    private static void printMainMenu() {
        System.out.println();
        System.out.println("Menu Utama");
        System.out.println("1. Tambah data ke pohon");
        System.out.println("2. Cari data");
        System.out.println("3. Tampilkan traversal");
        System.out.println("4. Tampilkan ringkasan pohon");
        System.out.println("5. Reset pohon");
        System.out.println("0. Keluar");
    }

    private static void handleInsert(BinaryTree tree, Scanner scanner) {
        int value = readInteger(scanner, "Masukkan nilai integer yang akan ditambahkan: ");
        tree.insert(value);
        System.out.println("Data " + value + " berhasil ditambahkan ke pohon.");
    }

    private static void handleSearch(BinaryTree tree, Scanner scanner) {
        if (tree.isEmpty()) {
            System.out.println("Pohon masih kosong. Tambahkan data terlebih dahulu.");
            return;
        }

        int value = readInteger(scanner, "Masukkan nilai yang ingin dicari: ");
        boolean found = tree.contains(value);

        if (found) {
            System.out.println("Data " + value + " ditemukan di dalam pohon.");
        } else {
            System.out.println("Data " + value + " tidak ditemukan di dalam pohon.");
        }
    }

    private static void handleTraversalMenu(BinaryTree tree, Scanner scanner) {
        if (tree.isEmpty()) {
            System.out.println("Pohon masih kosong. Tambahkan data terlebih dahulu.");
            return;
        }

        boolean back = false;
        while (!back) {
            System.out.println();
            System.out.println("Pilih traversal");
            System.out.println("1. Pre Order");
            System.out.println("2. In Order");
            System.out.println("3. Post Order");
            System.out.println("0. Kembali ke menu utama");

            int choice = readInteger(scanner, "Pilih traversal: ");

            switch (choice) {
                case 1:
                    printTraversal("Pre Order", tree.preOrderTraversal());
                    break;
                case 2:
                    printTraversal("In Order", tree.inOrderTraversal());
                    break;
                case 3:
                    printTraversal("Post Order", tree.postOrderTraversal());
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Pilihan traversal tidak valid.");
            }
        }
    }

    private static void handleSummary(BinaryTree tree) {
        if (tree.isEmpty()) {
            System.out.println("Pohon masih kosong.");
            return;
        }

        System.out.println(tree.getSummary());
    }

    private static void handleReset(BinaryTree tree, Scanner scanner) {
        if (tree.isEmpty()) {
            System.out.println("Pohon sudah kosong.");
            return;
        }

        String confirmation = readText(scanner, "Yakin ingin menghapus seluruh data? (y/n): ");
        if (confirmation.equalsIgnoreCase("y")) {
            tree.clear();
            System.out.println("Seluruh data berhasil dihapus.");
        } else {
            System.out.println("Reset dibatalkan.");
        }
    }

    private static void printTraversal(String label, String values) {
        System.out.println(label + " : " + values);
    }

    private static void printSeparator() {
        System.out.println("--------------------------------------------");
    }

    private static int readInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
            }
        }
    }

    private static String readText(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input tidak boleh kosong.");
        }
    }
}