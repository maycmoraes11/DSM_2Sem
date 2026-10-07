import { useEffect, useState } from 'react';

function Head() {
  return <header>Header</header>;
}

function Component() {
  return <h1> Component </h1>;
}

function Footer() {
  return <footer>Dashboard</footer>;
}

function Dashboard() {
  return <h1>Dashboard</h1>;
}

function Login() {
  return <h1> login</h1>;
}

const Authenticated = false;

const Pages = Authenticated ? <Dashboard /> : <Login />;

type Aluno = {
  id: number;
  nome: string;
  img?: string; //
};

const listaAluno: Aluno[] = [
  {
    id: 1,
    nome: 'Maycon Moraes',
    img: 'https://randomuser.me/api/portraits/men/3.jpg',
  },
  {
    id: 2,
    nome: 'Ana Silva',
    img: 'https://randomuser.me/api/portraits/women/2.jpg',
  },
  {
    id: 3,
    nome: 'Carlos Eduardo',
    img: 'https://randomuser.me/api/portraits/men/1.jpg',
  },
  { 
    id: 4, 
    nome: 'Beatriz Lima',
    img: 'https://randomuser.me/api/portraits/women/3.jpg'
  },
];

const avatarPadrao = 'https://randomuser.me/api/portraits/lego/1.jpg';

export default function Atv() {
  const [contador, setContador] = useState(0);
  const [segundos, setSegundos] = useState(10);

  useEffect(() => {
    const interval = setInterval(() => {
      setSegundos((current) => {
        if (current <= 1) {
          clearInterval(interval);
          return 0;
        }
        return current - 1;
      });
    }, 1000);

    return () => {
      clearInterval(interval);
    };
  }, []); // Array de dependências adicionado aqui

  function adicionar() {
    setContador(contador + 1);
  }

  function diminuir() {
    setContador(contador - 1);
  }

  return (
    <>
      <div>
        <h2> Cronômetro </h2>
        {segundos}s
      </div>
      <div>
        <h1> Contador: {contador} </h1>
        <button onClick={adicionar}> Adicionar +1</button>
        <button onClick={diminuir}> Diminuir -1</button>
      </div>
      <Head />
      <Component />
      {Pages}
      <ul>
        {listaAluno.map((aluno) => (
          <li key={aluno.id}>
            <img src={aluno.img || avatarPadrao} alt={aluno.nome} width={50} height={50} />
            <p> {aluno.nome} </p>
          </li>
        ))}
      </ul>
      <Footer />
    </>
  );
}
