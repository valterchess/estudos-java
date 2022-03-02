

/**
 * Essa simples versão de HashMap, faz uso exclusivo de Strings para suas chaves,
 *  e seus valores são sempre int (inteiros). 
 
 * @author Valter Silva (github.com/valterchess)
 *
 */
public class MinimalMap {
	
	/**
	 * A capacidade máxima usada no caso de um valor for especificado de forma implicita
	 * por algum dos construtores com argumentos.
	 * Deve ser uma poteência de 2 <= 1<<30.
	 * 
	 */
	static final int MAXIMUM_CAPACITY = 1 << 30;
	
	/**
	 * A tabela é dimencionada conforme o necessário.
	 *  O tamanho deve ser sempre uma potência de 2.
	 */
	private Entrance[] table;
	/**
	 * O número da chave-valor mapeia o conteúdo neste mapa
	 */
	private int size;
	/**
	 * 
	 * @serial
	 *
	 */
	private int threshold;
	/**
	 * 
	 * @serial
	 *
	 */
	private final float loadFactor = 0.75f;
	/**
	 *
	 */
	public MinimalMap() {
		threshold = (int)(16 * loadFactor);
		table = new Entrance[16];
	}

	static final class Entrance {
		final String key;
		short value;
		Entrance next;
		final int hash;
		
		/**
		 * Creates new Entrance (The constructor)
		 */
		Entrance(final int hash1, String key1, final short value1, final Entrance next1 ) {
			value = value1;
			next = next1;
			key = key1;
			hash = hash1;
		}
		
		public final String getKey() {
			return key;
		}
		
		public final int getValue() {
			return value;
		}
		
		public final int setValue(short newValue) {
			int oldValue = value;
			value = newValue;
			return oldValue;
		}
	}
}
