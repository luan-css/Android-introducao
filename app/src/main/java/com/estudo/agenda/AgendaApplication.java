package com.estudo.agenda;

import android.app.Application;

import com.estudo.agenda.DAO.AlunoDAO;
import com.estudo.agenda.model.Aluno;

@SuppressWarnings("WeakerAccess")
public class AgendaApplication extends Application {
    
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Luan", "11976653008", "sluan298@gmail.com"));
        dao.salva(new Aluno("Italo", "1197658798", "paaa@gmail.com"));
    }
}
