import { Link } from 'react-router-dom';

export default function NotFound() {
  return (
    <main className="min-h-screen flex flex-col items-center justify-center bg-slate-100 text-slate-800 px-6 text-center">
      <h1 className="text-5xl font-extrabold mb-2">404</h1>
      <p className="text-slate-500 mb-6">Página não encontrada.</p>
      <Link to="/" className="bg-blue-600 text-white py-2.5 px-5 rounded-lg text-sm font-semibold no-underline hover:bg-blue-700">
        Voltar ao início
      </Link>
    </main>
  );
}