package msa.api.user;

import msa.api.user.controller.MemberRepository;
import msa.api.user.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MsaUserApiApplication implements CommandLineRunner {

	@Autowired
	private MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(MsaUserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		memberRepository.save(Member.join("member1"));
		memberRepository.save(Member.join("member2"));
	}

}
