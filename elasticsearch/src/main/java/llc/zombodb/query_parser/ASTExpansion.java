/* Generated By:JJTree: Do not edit this line. ASTExpansion.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package llc.zombodb.query_parser;

public
class ASTExpansion extends QueryParserNode {

  private boolean generated;
  private boolean subselect;

  public ASTExpansion(int id) {
    super(id);
  }


  public ASTExpansion(QueryParser p, int id) {
    super(p, id);
  }

  @Override
  public ASTIndexLink getIndexLink() {
    return (ASTIndexLink) this.jjtGetChild(0);
  }

  public QueryParserNode getQuery() {
    return (QueryParserNode) this.jjtGetChild(1);
  }

  public boolean isGenerated() {
    return generated;
  }

  public QueryParserNode getFilterQuery() {
      for (QueryParserNode child : this) {
        if (child instanceof ASTFilter)
          return child.getChild(0);
      }
    return null;
  }

  public void setGenerated(boolean generated) {
    this.generated = generated;
  }

  public boolean isSubselect() {
    return subselect;
  }

  public void setSubselect(boolean subselect) {
    this.subselect = subselect;
  }

  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d7e08e299537e0b4ae6660febf4b4728 (do not edit this line) */
