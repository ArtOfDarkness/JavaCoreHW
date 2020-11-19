public interface Iterator {
	boolean hasNext();
	Integer next();}
	class Collection {
	private static Integer[] array;
	Collection(Integer[] array) {
		Collection.array = array;
	}
	public class ForwardIterator implements Iterator {
		private int i = 0;
		@Override
		public boolean hasNext() {
			return i < array.length;
		}
		@Override
		public Integer next() {
			return array[i++];
		}
	}
	public ForwardIterator createForwardIterator() {
		return new ForwardIterator();
	}
	public class BackwardIterator implements Iterator {
		private int i = array.length - 1;
		@Override
		public boolean hasNext() {
			return i >= 0;
		}
		@Override
		public Integer next() {
			i = i - 2;
			return array[i + 2];
		}
	}
	public BackwardIterator createBackwardIterator() {
		return new BackwardIterator();
	}
	public Iterator createAnonymousIterator() { return new Iterator() {
		private int i = array.length - 1;

		@Override
		public boolean hasNext() { return i >= 0; }
		@Override
		public Integer next() {
				return array[i--];
			}
		};
	}
	public Iterator createLocalIterator() {
		class LocalIterator implements Iterator { private int i = 0;
		@Override
		public boolean hasNext() {
				return i < array.length;
			}
		@Override
		public Integer next() {
				return array[i++];
			}
		}
		return new LocalIterator();
	}
	static class StaticIterator implements Iterator {
		private int i = 0;
		@Override
		public boolean hasNext() {
			return i < array.length;
		}
		@Override
		public Integer next() {
			return array[i++];
		}
	}
	static StaticIterator createStaticIterator() {
		return new StaticIterator();
	}
}