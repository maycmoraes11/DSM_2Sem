export default function Desenvolvedor() {
  return (
    <div className="max-w-2xl mx-auto my-10 p-8 bg-white rounded-2xl shadow-lg border border-gray-100">
      {/* Cabeçalho */}
      <div className="border-b border-gray-200 pb-4 mb-6">
        <h1 className="text-3xl font-bold text-gray-800">Desenvolvedor</h1>
        <p className="text-sm text-gray-500 mt-1">Conheça mais sobre o autor deste projeto.</p>
      </div>

      {/* Perfil */}
      <div className="space-y-4">
        <h2 className="text-xl font-semibold text-emerald-700 leading-relaxed">
          Me chamo Maycon, sou professor e estudo Desenvolvimento de Software Multiplataforma na FATEC.
        </h2>

        {/* Lista de destaques */}
        <ul className="space-y-3 pt-2">
          <li className="flex items-center gap-2 text-gray-700 bg-emerald-50 p-3 rounded-lg border border-emerald-100">
            <span className="text-emerald-600 font-bold">✓</span> Aprendi HTML e CSS
          </li>
          <li className="flex items-center gap-2 text-gray-700 bg-emerald-50 p-3 rounded-lg border border-emerald-100">
            <span className="text-emerald-600 font-bold">✓</span> Realizo um projeto integrador chamado SAVV
          </li>
          <li className="flex items-center gap-2 text-gray-700 bg-emerald-50 p-3 rounded-lg border border-emerald-100">
            <span className="text-emerald-600 font-bold">✓</span> Me interesso por trabalhos de tecnologia integrados com o Ramo Socioambiental
          </li>
          <li className="flex items-center gap-2 text-gray-700 bg-emerald-50 p-3 rounded-lg border border-emerald-100">
            <span className="text-emerald-600 font-bold">✓</span> Atualmente estou desenvolvendo atividades em Java e em React
          </li>
        </ul>

        {/* Botões de Ação / Links */}
        <div className="flex flex-wrap gap-4 pt-6 mt-6 border-t border-gray-100">
          <button 
            onClick={() => alert('Projeto SAVV selecionado!')}
            className="px-5 py-2.5 bg-emerald-600 hover:bg-emerald-700 text-white font-medium rounded-lg shadow transition-colors"
          >
            Ver Projeto SAVV
          </button>
          
          <button 
            onClick={() => window.open('https://github.com/ggustavo-souza/SAVV', '_blank')}
            className="px-5 py-2.5 bg-gray-800 hover:bg-gray-900 text-white font-medium rounded-lg shadow transition-colors"
          >
            Acessar GitHub
          </button>
        </div>
      </div>
    </div>
  );
}
