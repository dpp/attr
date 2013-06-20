package com.safmh {
package snippet {

import _root_.scala.xml.{NodeSeq, Text}
import _root_.net.liftweb.util._
import _root_.net.liftweb.common._
import _root_.java.util.Date
import com.safmh.lib._
import Helpers._
import net.liftweb.http.{S, SHtml}
import net.liftweb.http.js.JE.JsRaw

class HelloWorld {
    def myInputNs() = <input autofocus={None} />
    val cs : CssSel = ("input [autofocus]" #> (None: Option[String]))
    def howdy_bug2 = cs(myInputNs())
}

}
}
