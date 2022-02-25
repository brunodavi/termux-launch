package com.termux.launch;

class Main {

  public static void print(String msg) {
    System.out.println(msg);
  }

  public static void help() {
    print(
       "Usage:" 
       + "\n" + " launch" 
       + "\n" + "   Launch apps on android"
       + "\n" + ""
       + "\n" + "  -a --app     <app_name>     -- open app"
       + "\n" + "  -i --info    <app_name>     -- open app settings"
       + "\n" + "  -p --package <app_package>  -- open app from package"
       + "\n" + "  -u --update                 -- load all apps"
       + "\n" + "  -h --help                   -- show help"
    );
  }

  public static void main(String[] args) {
    String option = "";
    String arg = "";

    if (args.length >= 1) {
      option = args[0];
    } 

    if (args.length >= 2) {
      arg = args[1];
    }

    switch (option) {
      case "--app":
        print(option + " " + "not implemented");
        break;

      case "-a":
        print(option + " " + "not implemented");
        break;

      case "--info":
        print(option + " " + "not implemented");
        break;

      case "-i":
        print(option + " " + "not implemented");
        break;

      case "--package":
        print(option + " " + "not implemented");
        break;

      case "-p":
        print(option + " " + "not implemented");
        break;

      case "--update":
        print(option + " " + "not implemented");
        break;

      case "-u":
        print(option + " " + "not implemented");
        break;

      case "--help":
        help();
        break;

      case "-h":
        help();
        break;

      default:
        print(option + " " + "not exists");
        break;
    }
  }

}
