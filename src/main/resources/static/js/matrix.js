const canvas = document.getElementById('matrix-background');
const context = canvas.getContext('2d');

canvas.height = window.innerHeight;
canvas.width = window.innerWidth;

function createMatrixEffect() {
    const columns = Math.floor(canvas.width / 20);
    const drops = Array(columns).fill(0);
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    
    function draw() {
        context.fillStyle = 'rgba(0, 0, 0, 0.1)';
        context.fillRect(0, 0, canvas.width, canvas.height);
        
        context.fillStyle = '#0F0';
        context.font = '20px monospace';

        drops.forEach((drop, index) => {
            const text = characters[Math.floor(Math.random() * characters.length)];
            context.fillText(text, index * 20, drop * 20);
            if (drop * 20 > canvas.height && Math.random() > 0.975) {
                drops[index] = 0;
            }
            drops[index]++;
        });
    }

    setInterval(draw, 50);
}

createMatrixEffect();
