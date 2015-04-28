package com.xt.d3;

/**
 * Created by Administrator on 2015/4/28.
 */
public class MainServer {
    public static void main(String[] args) {
        if (null == args || 0 == args.length) {
            System.err.println(" nothing input? what you want?");
            System.exit(1);
        }
        try {
            switch (Integer.parseInt(args[0])) {
                case 0: weaponDPS(args);
                    break;
                case 1: paramsDPS(args);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }catch (NumberFormatException e){
            System.err.println(" wrong number ");
        }
    }

    /**
     * which weapon is better
     * @param args
     */
    private static void weaponDPS(String[] args){

    }

    /**
     * which param is better
     * @param args
     */
    private static void paramsDPS(String[] args){

    }


}
