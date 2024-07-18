class inttoroman {
    public String intToRoman(int num) {
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hunds[] = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[] = {"","M","MM","MMM","MMMM","MMMMM"};

        StringBuilder sb = new StringBuilder();
        sb.append(ths[num/1000]);
        num = num %1000;
        sb.append(hunds[num/100]);
        num = num % 100;
        sb.append(tens[num/10]);
        sb.append(ones[num%10]);

        return sb.toString();
    }
}
