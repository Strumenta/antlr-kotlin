import org.antlr.v4.Tool
import org.antlr.v4.codegen.CodeGenerator
import org.antlr.v4.codegen.Target
import org.antlr.v4.tool.ErrorType

fun main(args: Array<String>) {
//    val language = "Kotlin"
//    val targetName = "org.antlr.v4.codegen.target." + language + "Target"
//    try {
//        val c = Class.forName(targetName).asSubclass(Target::class.java)
//        val ctor = c.getConstructor(CodeGenerator::class.java)
//        //val cg = CodeGenerator(language)
//        //ctor.newInstance(cg)
//        println(ctor)
//        //val target = ctor.newInstance(this)
//    } catch (e: Exception) {
//        println("KO $e")
//    }

    //Tool.main(arrayOf("-Dlanguage=Kotlin", /*"-o", "/Users/federico/repos/antlr-kotlin-runtime-idea/antlr-kotlin-runtime-examples-jvm/src/main/kotlin",*/ "src/test/resources/MiniCalcLexer.g4"))
    Tool.main(arrayOf("-Dlanguage=Kotlin", /*"-o", "/Users/federico/repos/antlr-kotlin-runtime-idea/antlr-kotlin-runtime-examples-jvm/src/main/kotlin",*/ "antlr-kotlin-target/src/test/resources/MiniCalcParser.g4"))
}