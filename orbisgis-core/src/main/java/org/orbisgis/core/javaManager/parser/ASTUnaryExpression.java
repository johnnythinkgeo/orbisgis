/* Generated By:JJTree: Do not edit this line. ASTUnaryExpression.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.orbisgis.core.javaManager.parser;

public class ASTUnaryExpression extends SimpleNode {
  public ASTUnaryExpression(int id) {
    super(id);
  }

  public ASTUnaryExpression(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fd4d79d949ff01c4e6232a58a93b11f0 (do not edit this line) */
