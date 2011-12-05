package behavioral.iterator;

public class BooksCollection implements IContainer {
	private String m_titles[] = { "Design Patterns", "1", "2", "3", "4" };

	public IIterator createIterator() {
		BookIterator result = new BookIterator();
		return result;
	}

	private class BookIterator implements IIterator {
		private int m_position;

		public boolean hasNext() {
			if (m_position < m_titles.length)
				return true;
			else
				return false;
		}

		public Object next() {
			if (this.hasNext())
				return m_titles[m_position++];
			else
				return null;
		}
	}

}
