package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Book;
import com.example.demo.domain.Library;
import com.example.demo.domain.Post;
import com.example.demo.domain.PostComments;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LibraryRepository;
import com.example.demo.repository.PostCommentRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TodoListItemRepository;
import com.example.demo.repository.TodoListRepository;

@SpringBootApplication
public class ListaExercicioOrmApplication  implements CommandLineRunner{

	@Autowired
	TodoListRepository todoRepository;
	
	@Autowired
	TodoListItemRepository todoItem;
	
	@Autowired
	LibraryRepository library;
	
	@Autowired
	BookRepository book;
	
	@Autowired
	PostRepository post;
	
	@Autowired
	PostCommentRepository postComment;

	public static void main(String[] args) {
		SpringApplication.run(ListaExercicioOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		TodoList td = new TodoList(null,"TesteNull");
//		todoRepository.save(td);
//		
//		TodoListItem Item1 = new TodoListItem(null,"item1",td);
//		TodoListItem Item2 = new TodoListItem(null,"item2",td);
//		TodoListItem Item3 = new TodoListItem(null,"item3",td);
//		TodoListItem Item4 = new TodoListItem(null,"item4",td);
//		TodoListItem Item5 = new TodoListItem(null,"item5",td);
//		
//		todoItem.save(Item1);
//		todoItem.save(Item2);
//		todoItem.save(Item3);
//		todoItem.save(Item4);
//		todoItem.save(Item5);
//		
//		td.getListaDeItens().add(Item1);
//		td.getListaDeItens().add(Item2);
//		td.getListaDeItens().add(Item3);
//		td.getListaDeItens().add(Item4);
//		td.getListaDeItens().add(Item5);
		
		
//		Library lib = new Library(null,"TesteNull");
//		library.save(lib);
//		
//		Book livro1 = new Book(null,"livro1",lib);
//		Book livro2 = new Book(null,"livro2",lib);
//		Book livro3 = new Book(null,"livro3",lib);
//		Book livro4 = new Book(null,"livro4",lib);
//		
//		book.save(livro1);
//		book.save(livro2);
//		book.save(livro3);
//		book.save(livro4);
//		
//		lib.getBookList().add(livro1);
//		lib.getBookList().add(livro2);
//		lib.getBookList().add(livro3);
//		lib.getBookList().add(livro4);
		
		
		
		Post pt= new Post(null,"testeNull");
		
		post.save(pt);
		
		PostComments post1= new PostComments(null,"post1",pt);
		PostComments post2= new PostComments(null,"post2",pt);
		PostComments post3= new PostComments(null,"post3",pt);
		PostComments post4= new PostComments(null,"post4",pt);
		
		postComment.save(post1);
		postComment.save(post2);
		postComment.save(post3);
		postComment.save(post4);
		
		pt.getComments().add(post1);
		pt.getComments().add(post2);
		pt.getComments().add(post3);
		pt.getComments().add(post4);
		
		
	}

}
