/* Generated By:JJTree: Do not edit this line. ASTSQLCreate.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.gdms.sql.parser;

public
class ASTSQLCreate extends SimpleNode {
  public ASTSQLCreate(int id) {
    super(id);
  }

  public ASTSQLCreate(SQLEngine p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SQLEngineVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=72a4eae176ad368a650d78c01d2a9e84 (do not edit this line) */
