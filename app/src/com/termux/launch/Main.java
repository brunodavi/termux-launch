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
    for (String arg : args) {
      switch (arg) {
        case "--app":
          print(arg + " " + "not implemented");
          break;

        case "-a":
          print(arg + " " + "not implemented");
          break;

        case "--info":
          print(arg + " " + "not implemented");
          break;

        case "-i":
          print(arg + " " + "not implemented");
          break;

        case "--package":
          print(arg + " " + "not implemented");
          break;

        case "-p":
          print(arg + " " + "not implemented");
          break;

        case "--update":
          print(arg + " " + "not implemented");
          break;

        case "-u":
          print(arg + " " + "not implemented");
          break;

        case "--help":
          help();
          break;

        case "-h":
          help();
          break;
      }
    }
  }

}
