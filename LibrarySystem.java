public class LibrarySystem {
    public LibrarySystem() {
        
    }

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws EmptyAuthorListException {
        if(authors.isEmpty()) {
            throw new EmptyAuthorListException();
        }
    }

    public void addStudentUser(String name, boolean feePaid) {
        
    }

    public void addFacultyMember(String name, String department) {
        
    }

    public Book findBookByTitle(String title) {
        return null;
    }

    public User findUserByName(String name) {
        return null;
    }

    public void borrowBook(Book book, User user) throws UserOrBookDoesNotExistException {
        if(book == null) {
            throw new UserOrBookDoesNotExistException("Book does not exist");
        }
        if(user == null) {
            throw new UserOrBookDoesNotExistException("User does not exist");
        }
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
        
    }

    public void returnBook(User user, Book book) {
        
    }
}
