package club.diybio.bank

import akka.actor.{ActorSystem, _}

/**
 * For running as kernel
 */
object Main extends App
{
  implicit val system = ActorSystem()

  sys.addShutdownHook(system.shutdown())
  var main:ActorRef = system.actorOf(Props[MainActor])
  main ! AppMessages.Start(1234)


}
