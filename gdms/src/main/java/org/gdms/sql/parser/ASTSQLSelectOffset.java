/* Generated By:JJTree: Do not edit this line. ASTSQLSelectOffset.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.gdms.sql.parser;

public
class ASTSQLSelectOffset extends SimpleNode {
  public ASTSQLSelectOffset(int id) {
    super(id);
  }

  public ASTSQLSelectOffset(SQLEngine p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SQLEngineVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fac033e86a0dca2ca1e9fcf80e54c2b0 (do not edit this line) */
