import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Aulas from './pages/Aulas';
import Desenvolvedor from './pages/Desenvolvedor';
import Estudos from './pages/Estudos';
import EmBreve from './pages/EmBreve';
import NotFound from './pages/NotFound';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/aulas" element={<Aulas />} />
        <Route path="/desenvolvedor" element={<Desenvolvedor />} />
        <Route path="/estudos" element={<Estudos />} />
        <Route path="/acervo" element={<EmBreve titulo="Acervo" />} />
        <Route path="/recomendacao" element={<EmBreve titulo="Recomendações" />} />
        <Route path="/login" element={<EmBreve titulo="Entrar" />} />
        <Route path="/register" element={<EmBreve titulo="Criar conta" />} />
        <Route path="/chat" element={<EmBreve titulo="Chat" />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;