package com.termux.launch;

class Main {

  public static void print(String msg) {
    System.out.println(msg);
  }

  public static void help() {
    print(
       "Usage:" 
       + "\n" + " launch" 
       + "\n" + "     [ -a --app <app_name> ]        [ -u --update ]"
       + "\n" + "     [ -i --info <app_name> ]       [ -u --help ]"
       + "\n" + "     [ -p --package <app_package> ]"
       + "\n" + ""
       + "\n" + " Launch apps on android"
       + "\n" + ""
       + "\n" + "  -a --app      -- open app"
       + "\n" + "  -i --info     -- open app settings"
       + "\n" + "  -p --package  -- open app from package"
       + "\n" + "  -u --update   -- load all apps"
       + "\n" + "  -h --help     -- show help"
    );
  }

  public static void main(String[] args) {
    for (String arg : args) {
      switch (arg) {
        case "--help":
          help();
          break;

        case "-h":
          help();
          break;

        default:
          help();
          break;
      }
    }
  }

}
