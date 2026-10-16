import { useState, useEffect } from 'react';

export default function Estudos() {
  const [segundos, setSegundos] = useState(25 * 60);
  const [ativo, setAtivo] = useState(false);

  useEffect(() => {
    let intervalo: any = null;

    if (ativo && segundos > 0) {
      intervalo = setInterval(() => {
        setSegundos((atual) => atual - 1);
      }, 1000);
    }

    return () => clearInterval(intervalo);
  }, [ativo, segundos]);

  const minutos = Math.floor(segundos / 60);
  const segsRestantes = segundos % 60;

  return (
    <div>
      <h1>Timer Pomodoro</h1>
      <h2>
        {String(minutos).padStart(2, '0')}:{String(segsRestantes).padStart(2, '0')}
      </h2>

      {!ativo ? (
        <button onClick={() => setAtivo(true)}>Iniciar</button>
      ) : (
        <button onClick={() => setAtivo(false)}>Pausar</button>
      )}

      <button onClick={() => { setAtivo(false); setSegundos(25 * 60); }}>
        Resetar
      </button>
    </div>
  );
}