/* Generated By:JJTree: Do not edit this line. ASTDefaultValue.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.orbisgis.core.javaManager.parser;

public class ASTDefaultValue extends SimpleNode {
  public ASTDefaultValue(int id) {
    super(id);
  }

  public ASTDefaultValue(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=05626a48329d97de3b132f0b6b04b12c (do not edit this line) */
