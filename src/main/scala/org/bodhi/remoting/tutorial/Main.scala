package org.bodhi.remoting.tutorial


object Main extends App {
  assert(args.length == 1)
  Console.println("Main " + (args mkString ", "))

  val name = args(0)

  name match {
    case "C100" => new Config100()
    case "T100" => new Tutorial100()
    case "M150" => new Manager150()
    case "W150" => new Worker150()
    case "M200" => new Manager200()
    case "W200" => new Worker200()

    case _ => Console.println("Unknown argument: " + name)
  }
}