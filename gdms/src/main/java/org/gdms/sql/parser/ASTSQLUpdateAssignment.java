/* Generated By:JJTree: Do not edit this line. ASTSQLUpdateAssignment.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.gdms.sql.parser;

public
class ASTSQLUpdateAssignment extends SimpleNode {
  public ASTSQLUpdateAssignment(int id) {
    super(id);
  }

  public ASTSQLUpdateAssignment(SQLEngine p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SQLEngineVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5ea03b72793904d418b16da45d99cee1 (do not edit this line) */
