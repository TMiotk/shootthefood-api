<?php
// Ścieżka do JSON – dostosuj jeśli plik jest w innym miejscu
$jsonPath = __DIR__ . '/recipes.json';

// Sprawdź czy plik istnieje
if (!file_exists($jsonPath)) {
    http_response_code(404);
    echo json_encode(["error" => "recipes.json not found"]);
    exit;
}

// Wczytaj JSON
$data = file_get_contents($jsonPath);

// Ustaw nagłówki odpowiedzi JSON + CORS
header('Content-Type: application/json; charset=utf-8');
header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: GET');

echo $data;
