package padraoprojeto.aula05.compositestring;

public abstract class DocumentElementTopoDocumento {
	CompositeDocumentElement parent; // this object's container

	//Retorna o objeto pai, ou nulo caso não tenha
	public CompositeDocumentElement getParent() {
		return parent;
	}
	// método abstrato que deverá ser implementado em todas as sub-classes
 	public abstract int apresentarDocumento();
 	public abstract String apresentarDocumentoString();
}  
