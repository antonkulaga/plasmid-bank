package club.diybio.bank.views

import club.diybio.bank.views.stubs.WithDomain
import org.denigma.binding.extensions._
import org.denigma.binding.views.BindableView
import org.querki.jquery._
import org.scalajs.dom.raw.HTMLElement
import rx._
import org.semantic.ui._

/**
 * View for the sitebar
 */
class SidebarView (val elem:HTMLElement,val params:Map[String,Any] = Map.empty[String,Any]) extends BindableView with WithDomain{
  val logo = Var("/resources/logo.jpg")

  override def bindElement(el:HTMLElement) = {
    super.bindElement(el)
    $(".ui.accordion").accordion()
  }
}

